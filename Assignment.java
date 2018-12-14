import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

public class Assignment {
    public static void main(String[] args) throws Exception {
        Dictionary<String,ArrayList<String>> dictionary = new Hashtable<>();
        BufferedReader read=new BufferedReader(new FileReader("Tweet.tsv"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Tweets.tsv"));
        BufferedReader bufferedReaders = new BufferedReader(new FileReader("Tweetss.tsv"));
        String strLine;
        String str;
        String str1;
        while ((strLine=read.readLine())!=null && ((str = bufferedReader.readLine())!= null && ((str1 = bufferedReaders.readLine()) != null))) {
            String[] ar = strLine.split("\t");
            String[] arr = str.split("\t");
            String[] array = str1.split("\t");
            String keyForar = new String();
            String valueForar = new String();
            String keyForarr = new String();
            String valueForarr = new String();
            String keyForarray = new String();
            String valueForarray = new String();
            ArrayList<String> values = new ArrayList<>();
            for (int i=0; i <ar.length ; i++) {
                ar[i] = ar[i].replaceAll("lang=hi","");
                keyForar= ar[1];
                valueForar = ar[0];
                if (valueForar.equalsIgnoreCase(valueForarr) || valueForar.equalsIgnoreCase(valueForarray)){
                    keyForar = ar[1];
                    values.add(valueForar);
                    values.add(valueForarr);
                    values.add(valueForarray);
                }
                dictionary.put(keyForar,values);
                }
            for (int i=0; i < arr.length; i++) {
//                arr[i] = arr[i].replaceAll(arr[arr.length/2],"?");
                keyForarr = arr[1];
                valueForarr= arr[0];
                if (keyForarr.equalsIgnoreCase(keyForar) || keyForarr.equalsIgnoreCase(keyForarray)){
                    keyForarr = arr[1];
                    values.add(valueForar);
                    values.add(valueForarr);
                    values.add(valueForarray);

                    dictionary.put(keyForarr,values);
                }
            }
            for (int i=0; i <array.length ; i++) {
                array[i] = array[i].replaceAll("lang=ur" ,"");
                keyForarray = array[1];
                valueForarray = array[0];
                if (keyForarray.equalsIgnoreCase(keyForarr) || keyForarray.equalsIgnoreCase(keyForar)){
                    keyForar = array[1];
                    values.add(valueForar);
                    values.add(valueForarr);
                    values.add(valueForarray);
                }
                dictionary.put(keyForarray,values);
            }
        }
        System.out.println(dictionary.get("/poets/abdul-rahman-khan-wasfi-bahraichi?"));
        System.out.println(dictionary.get("/poets/aanis-moin?"));
    }}






//        for (int i=0; i <key.size(); i++) {
//            dictionary.put(key.get(i),names.get(i));
//        }
//        Scanner scanner = new Scanner(System.in);
//        if (true){
//            System.out.println(dictionary.get(scanner.next()));
//        }
//        for (int i=0; i <splitOut.length  ; i++) {
//            names.add(splitOut[0]+""+splitArray[0]+""+splitedArray[0]);
//            key.add(splitOut[1]);
//        }

//        while ()


//        String key;

//        for (int i=0; i <splitedArray.length ; i++) {
//            dictionary.put()
//        }
//        for (int i=0; i <splitArray.length ; i++) {
//
//        }


//        for (int i=0; i < splitOut.length; i++) {
//            if (splitOut[i].equalsIgnoreCase(splitedArray[i]) || splitOut[i].equalsIgnoreCase(splitArray[i])){
//                arrayList.add(splitOut[i]);
//                arrayList.add(splitedArray[i]);
//                arrayList.add(splitArray[i]);
////                System.out.println(splitOut[i]);
//                dictionary.put(splitOut[1],arrayList);
//                dictionary.get(splitOut[1]);
//            }
//            else if (splitArray[i].equalsIgnoreCase(splitArray[i])){
//                arrayList.add(splitArray[i]);
//                System.out.println(splitArray[i]);
//                dictionary.put(splitArray[1],arrayList);
////                dictionary.get();
//            }
//            else {
//                System.out.println("Hence No Same Elements!");
//            }
//        }
//        dictionary.get()




//        dictionary.put()




//        for (int i=0; i <array.length ; i++) {
//            dataArray[i].replaceAll("lang=hi","");
//            System.out.println(dataArray[i]);
//        }
//            for (String token : splitOut) {
////                System.out.println(token);
//            }
//        for (int i=0; i < dataArray.length ; i++) {
//            a[i] = dataArray[i].replaceAll("lang=hi","");
//            System.out.println(a[i]);
//        }






//        File file = new File("Tweet.tsv");
//        Scanner s = new Scanner(file);
//
//        while (s.hasNextLine()){
//                dataArray =s.nextLine().split("\t");
//        }
//        for (int i = 0 ; i < dataArray.length; i++){
//            System.out.println(dataArray[i]);
//        }

//        for (int i=0; i < dataArray.length ; i++) {
//            a[i] = dataArray[i].replaceAll("lang=hi","");
//            System.out.println(a[i]);
//        }
//            String[] dataArray2 = TSVFile.readLine().split('');
//        if (dataArray[0].charAt(0) >= 'a' && dataArray[0].charAt(0) <= 'z' || dataArray[0].charAt(0) >= 'A' && dataArray[0].charAt(0) <= 'Z'){
//            System.out.println(dataArray[0]);
//        }
//        else {
//            System.out.println("A");

//            dictionary.put()
//            for (String item : dataArray) {
//                System.out.print(item + "  ");
//            }
//            int pos = Integer.parseInt(dataArray[0]);
//            System.out.println(pos);
//            System.out.println();
//        dictionary.put("Name","Afzal");
//        dictionary.put("Nam","Ahsan");
//
//        for (Enumeration  i = dictionary.elements();i.hasMoreElements();){
//            System.out.println(i.nextElement());
//        }

//        System.out.println();
//        for (int i=0; i < dictionary.size() ; i++) {
//            System.out.println();
//        }
//        for(String str : dictionary){
//
//        }


//        String str;
//        while ((str = TSVFile.readLine())!=null) {
//
//        }
//        String[] array = new String[args.length];
//        while (read.readLine() != null) {
////            System.out.println(read.readLine());
//            array=read.readLine().split("\t");
////            System.out.println(array);
//        }//         splitOut =new String[args.length];
////        while ((strLine=read.readLine())!=null && ((str = bufferedReader.readLine())!= null && ((str1 = bufferedReaders.readLine()) != null))){
////
////           array1 = strLine.split("\t");
////           array2 = str.split("\t");
////            array3 = str1.split("\t");
////
////            names.add(array1[0]+""+array2[0]+""+array3[0]);
////            key.add(array1[1]);
////        }
//        String[] array1= new String[10000];
//        String[] array2= new String[10000];
//        String[] array3= new String[10000];
//        while ((strLine = read.readLine())!=null) {
//            splitOut=strLine.split("\t");
////            names.add(splitOut[0]);
//            for (int i=0; i < splitOut.length; i++) {
//                splitOut[i]=splitOut[i].replaceAll("lang=hi", "");
////                key.add(splitOut[1]);
//            }
//        }
//        String key, value;
////        String[] splitArray = new String[10000];
//        while ((str=bufferedReader.readLine()) != null) {
//            String[] splitArray=str.split("\t");
//            value = splitArray[0];
//            key = splitArray[1];
//
//        }
////        String[] splitedArray = new String[10000];
//        while ((str1=bufferedReaders.readLine()) != null) {
//            String[] splitedArray=str1.split("\t");
//
//            for (int i=0; i <splitedArray.length ; i++) {
//                splitedArray[i] = splitedArray[i].replaceAll("lang=ur","");
////                key.add(splitOut[1]);
//                dictionary.put(splitedArray[1],splitedArray[0]);
//            }
//            }