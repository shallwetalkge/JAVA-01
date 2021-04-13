package classtwo.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>日志打印类</p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021-03-10 17:15
 * @since 1.8
 */
public class Logger {

    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("/User/shallwetalk/log.txt");
        writer = new FileWriter(file,true);
    }

    public void log(String message) throws IOException {
        writer.write(message);
    }

}
