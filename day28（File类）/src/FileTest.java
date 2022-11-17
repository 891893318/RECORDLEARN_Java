import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    /* File 类的使用：常用方法
     File类的获取功能
         public String getAbsolutePath()：获取绝对路径
         public String getPath() ：获取路径
         public String getName() ：获取名称
         public String getParent()：获取上层文件目录路径。若无，返回null
         public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
         public long lastModified() ：获取最后一次的修改时间，毫秒值
     */
    @Test
    public void test1() throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("D:\\JavaPrctice\\day29（File类）\\file1.txt");
        file1.createNewFile();
        System.out.println("获取绝对路径 "+file1.getAbsoluteFile());
        System.out.println("获取上层文件目录路径 "+file1.getParent());
        System.out.println("获取路径 "+file1.getPath());
        System.out.println("获取文件长度（即：字节数） 不能获取目录的长度 "+file1.length());
        System.out.println("获取最后一次的修改时间，毫秒值 "+new Date(file1.lastModified()));
        System.out.println();
        System.out.println("获取绝对路径 "+file2.getAbsoluteFile());
        System.out.println("获取上层文件目录路径 "+file2.getParent());
        System.out.println("获取路径 "+file2.getPath());
        System.out.println("获取文件长度（即：字节数） 不能获取目录的长度 "+file2.length());
        System.out.println("获取最后一次的修改时间，毫秒值 "+new Date(file2.lastModified()));
    }
    /*

        以下两个方法适用于文件目录：
         public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
         public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
     */
    @Test
    public void test2(){
        File file = new File("D:\\JavaPrctice");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
        File[] list1 = file.listFiles();
        for (File f :list1){
            System.out.println(f);
        }

    }

    /*
     File类的重命名功能
         public boolean renameTo(File dest):把文件重命名为指定的文件路径
            保证返回true，则要求file
     */
    @Test
    public void test3(){
        File file = new File("D:\\JavaPrctice\\day29（File类）\\file1.txt");
        File fileTo = new File("D:\\JavaPrctice\\file2.txt");
        boolean renameTo = fileTo.renameTo(file);
        System.out.println(renameTo);
    }
    /*
     File类的判断功能
         public boolean isDirectory()：判断是否是文件目录
         public boolean isFile() ：判断是否是文件
         public boolean exists() ：判断是否存在
         public boolean canRead() ：判断是否可读
         public boolean canWrite() ：判断是否可写
         public boolean isHidden() ：判断是否隐藏
     File类的创建功能
         public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
         public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。
          如果此文件目录的上层目录不存在，也不创建。
         public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
          注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目
          路径下。
     File类的删除功能
         public boolean delete()：删除文件或者文件夹
          删除注意事项：
            Java中的删除不走回收站。
          要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
     */
}
