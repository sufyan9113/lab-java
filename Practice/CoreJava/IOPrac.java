package Practice.CoreJava;
import java.io.*;

class IOPrac
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        File f=new File("object.txt");
        FileInputStream fis=new FileInputStream(f);
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);

        Employee e=(Employee)ois.readObject();

        e.show();

        

        /* 
        File dir=new File("Test");
        File file=new File(dir,"File.txt");

        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);

        pw.println("sufyan");
        pw.println(10);
        pw.println('a'+" "+'b'+" "+'c');
        pw.println(10.0);
        pw.println(10l);
        pw.println(10.2f);
        pw.close();


        /* 
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);

        String data=br.readLine();

        while(data!=null)
        {
            System.out.println(data);
            data=br.readLine();
        }
/* 
        int i=br.read();

        while(i!=-1)
        {
            
            System.out.print((char)i);
            i=br.read();
        }



        /* 
        FileWriter fr=new FileWriter(file);
        BufferedWriter br=new BufferedWriter(fr);

        br.write("first line");
        br.newLine();
        br.write("check");
        br.newLine();
        char[] c={97,98,99,100};
        br.write(c); 
        br.newLine();
        br.close();

/* 
        char[] c=new char[(int)file.length()];

        fr.read(c);

        for(char read: c)
        {
            System.out.print(read);
        }

        /* 
        int i=fr.read();
        
        while(i!=-1)
        {
            System.out.print(i+"--->");
            System.out.println((char)i);
            i=fr.read();
        }

/* 
        File dir=new File ("Test");
        dir.mkdir();
        File file=new File(dir,"File.txt");
        File file2=new File(dir,"PW.txt");
        file.createNewFile();
        file2.createNewFile();

        FileWriter fw=new FileWriter(file,true);

        fw.write("second line");
        fw.write("\n");
        fw.write(100);
        fw.write("\n");
        char[] c={'a','b','c','d'};
        fw.write(c);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        fw.close();
/* 
        File dir=new File ("Practice");
        int count=0;

        String[] data=dir.list();

        for(String s:data)
        {
            count++;
            System.out.println(s);
        }
        System.out.println(count);

/*
        File f=new File("PW.txt");
        System.out.println(f.isFile());
        FileWriter fw=new FileWriter(f,true);

        fw.write("second line");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write("java");
        fw.write("\n");
        fw.write("completed");
        fw.write("\n");
        char[] c={'a','b','c'};
        fw.write(c);
        fw.close();

        System.out.println("open file to see output");


/* 
        int count=0;
        File f=new File("Practice");

      //  File f2=new File(f,"java.txt");
       // f2.createNewFile();
        String[]list=f.list();

        for(String print:list)
        {
            count++;
            System.out.println(print);
        }

        System.out.println(count);

        /* 
        File f=new File("PW.txt");
        System.out.println(f.exists());
        f.createNewFile();

        System.out.println(f.exists());


        File f2=new File("Directory");
        System.out.println(f2.isDirectory());

        f2.mkdir();
        System.out.println(f2.isDirectory());

        */
    }
}