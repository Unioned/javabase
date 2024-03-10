import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest04 {

    public static final String root = "11-io/src/main/resources/";

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(root + "tempfile04.txt");
            // 开始读，采用byte数组，一次读取多个字节。最多读取“数组.length”个字节。
            byte[] bytes = new byte[3];// 准备一个4个长度的byte数组，一次最多读取4个字节。
            int readCount = 0;
            // 这个方法的返回值是：读取到的字节数量。（不是字节本身）;1个字节都没有读取到返回-1(文件读到末尾)
            while((readCount = fis.read(bytes)) != -1) {
                // 不应该全部都转换，应该是读取了多少个字节，转换多少个。
                System.out.print(new String(bytes, 0, readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally语句块当中确保流一定关闭。
            if (fis != null) {// 避免空指针异常！
                // 关闭流的前提是：流不是空。流是null的时候没必要关闭。
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
