package com.tzh.test;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import com.tzh.utils.IOToFileUtils;


public class IOToFileUtilsTest {

    /**
     * 以字节为单位读取文件，常用于读取二进制文件，如：图片、声音、影像等
     * <请替换成功能描述> <br>
     * <请替换成详细描述>
     * @author caizh
     * @since [1.0.0]
     * @version [1.0.0,2017年2月7日]
     */
    @Test
    public void readFileByBytes(){
        String fileName = "F:\\专高一\\2019-09-小一\\git\\sssss.txt";//读取时可能会出现乱码
        IOToFileUtils.readFileByBytes(fileName);
    }

    /**
     * 以字符为单位读取文件，常用于读取文本，数字等类型的文件
     * <请替换成功能描述> <br>
     * <请替换成详细描述>
     * @author caizh
     * @since [1.0.0]
     * @version [1.0.0,2017年2月7日]
     */
    @Test
    public void readFileByCharts(){
        String fileName = "E:/mkdir/copy/free.ftl";
        IOToFileUtils.readFileByChars(fileName);
    }

    /**
     * 以行为单位读取文件，常用于读取面向行的格式化文件
     * <请替换成功能描述> <br>
     * <请替换成详细描述>
     * @author caizh
     * @since [1.0.0]
     * @version [1.0.0,2017年2月7日]
     */
    @Test
    public void readFileByLines(){
        String fileName = "E:/mkdir/copy/append.txt";
        IOToFileUtils.readFileByLines(fileName);
    }

    /**
     * 随机读取文件内容
     * <请替换成功能描述> <br>
     * <请替换成详细描述>
     * @author caizh
     * @since [1.0.0]
     * @version [1.0.0,2017年2月7日]
     */
    @Test
    public void readFileByRandomAccess(){
        String fileName = "E:/mkdir/copy/free.ftl";
        IOToFileUtils.readFileByRandomAccess(fileName);
    }

    /**
     * 将内容追加到文件尾部  A方法：使用RandomAccessFile
     * <请替换成功能描述> <br>
     * <请替换成详细描述>
     * @author caizh
     * @since [1.0.0]
     * @version [1.0.0,2017年2月7日]
     * @throws UnsupportedEncodingException 
     */
    @Test
    public void appendToFile_A() throws UnsupportedEncodingException{
        String fileName = "E:/mkdir/copy/append.txt";
        String content = "aaaa这是后面添加的内容A！";//添加中文时会有乱码
        IOToFileUtils.appendToFile_A(fileName, content);
    }

    /**
     * 将内容追加到文件尾部  B方法：使用FileWriter
     * <请替换成功能描述> <br>
     * <请替换成详细描述>
     * @author caizh
     * @since [1.0.0]
     * @version [1.0.0,2017年2月7日]
     */
    @Test
    public void appendToFile_B(){
        String fileName = "E:/mkdir/copy/append.txt";
        String content = "aaaa这是后面添加的内容！B";//注意添加txt保存时的编码格式utf-8
        IOToFileUtils.appendToFile_B(fileName, content);
    }

    @Test
    public void appendToFile_C(){
        String fileName = "E:/mkdir/copy/append.txt";
        String content = "aaaa这是后面添加的内容！C";//注意添加txt保存时的编码格式utf-8
        IOToFileUtils.appendToFile_C(fileName, content);
    }
}
