package file;

import exceptions.main;

import java.io.File;

public class searchFile {
    public static void main(String[] args) {
        search(new File("D:/"),"Warpips.exe");
    }

    public static void search(File dir,String filename ){
        if (dir!=null&&dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files!=null&&files.length>0){
                for (File file : files) {
                    if(file.isFile()){
                        if(file.getName().contains(filename)){
                            System.out.println("位置为："+file.getAbsolutePath());
                        }
                    }else{
                        search(file,filename);
                    }
                }
            }
        }else{
            System.out.println("未找到指定文件");
        }
    }
}
