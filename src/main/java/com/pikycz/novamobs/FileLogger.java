package com.pikycz.novamobs;

import cn.nukkit.Server;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

public class FileLogger {

    private static PrintWriter printWriter = null;

    static {
        // we create a new file each time the server starts ...
        try {
            printWriter = new PrintWriter(Server.getInstance().getDataPath() + "novamobs.log", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                printWriter.close();
            }
        });
    }

    public static void debug(String text) {
        printWriter.println(String.format("%s | [DEBUG]  | %s", new Timestamp(System.currentTimeMillis()), text));
        printWriter.flush();
    }

    public static void info(String text) {
        printWriter.println(String.format("%s | [INFO]   | %s", new Timestamp(System.currentTimeMillis()), text));
        printWriter.flush();
    }

    public static void warn(String text) {
        printWriter.println(String.format("%s | [WARN]   | %s", new Timestamp(System.currentTimeMillis()), text));
        printWriter.flush();
    }

    public static void warn(String text, Throwable e) {
        printWriter.println(String.format("%s | [WARN]   | %s", new Timestamp(System.currentTimeMillis()), text));
        printWriter.println(String.format("%s | [WARN]   | %s", new Timestamp(System.currentTimeMillis()), stackTraceToString(e)));
        printWriter.flush();
    }

    private static String stackTraceToString(Throwable e) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement element : e.getStackTrace()) {
            sb.append(element.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
