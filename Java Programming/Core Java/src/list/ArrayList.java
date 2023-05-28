package list;

import java.util.Iterator;
import java.util.List;
public class ArrayList {
    public static void main(String[] args) {
////        adding objects
        List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
////        adding object in index
//        integerList.add(1,100);
//        System.out.println(integerList);
//    }
//        removing the object
//        Using remove() method by indexes(default)
//        Using remove() method by values
//        Using remove() method over iterators

//        System.out.println(integerList);
//        integerList.remove(1);
//        System.out.println(integerList);

//        removing by values
//        integerList.remove(Integer.valueOf(38));
//        System.out.println(integerList);

//        method over iterators
//        Iterator<Integer> iterator = integerList.iterator();
//        while (iterator.hasNext()){
//            int x = iterator.next();
//            if (x < 32){
//                iterator.remove();
//            }
//        }
//        System.out.println(integerList);

//        iterating from specific index
        System.out.println(integerList);
        Iterator<Integer> listIterator = integerList.listIterator(2);
       while (listIterator.hasNext()) {
           System.out.print(listIterator.next());
       }
//        update element
//        int i = integerList.set(1,100);
//        System.out.println("after updating " + integerList);

//        removing duplicate
//        using iterator
//        integerList.add(1);
//        integerList.add(4);
//        Collections.sort(integerList);
//        System.out.println(integerList);
//        List<Integer> newArray = new java.util.ArrayList<>();
//        for (int x : integerList){
//            if (!newArray.contains(x)){
//                newArray.add(x);
//            }
//        }
//        System.out.println(newArray);

//        using Set
//        Set<Integer> integerSet = new LinkedHashSet<>(integerList);
//        List<Integer> newArray = new java.util.ArrayList<>(integerSet);
//        System.out.println(newArray);

//        using java 8 stream.distinct()
//        List<Integer> newArray = integerList.stream().distinct().collect(Collectors.toList());
//        System.out.println(newArray);

//        reversing the arrayList
//        List<Integer> newArray = new java.util.ArrayList<>();
//        for (int i = integerList.size()-1; i >= 0; i--){
//            newArray.add(integerList.get(i));
//        }
//        System.out.println(newArray);

//        by bubble sort
//        int temp = 0;
//        for (int i = 0; i < integerList.size(); i++){
//            for (int j = i + 1; j < integerList.size(); j++){
//                if (integerList.get(i) < integerList.get(j)){
//                    temp = integerList.get(i);
//                    integerList.set(i, integerList.get(j));
//                    integerList.set(j, temp);
//                }
//            }
//        }
//        System.out.println(integerList);

//        by collections class
//        Collections.reverse(integerList);
//        System.out.println(integerList);

//        by using list iterator
//       ListIterator<Integer> listIterator = integerList.listIterator(integerList.size());
//       List<Integer> newArray = new java.util.ArrayList<>();
//       while (listIterator.hasPrevious()){
//           int x  = listIterator.previous();
//           newArray.add(x);
//       }
//        System.out.println(newArray);

//        converting to string array
//        using get()
//        String[] strArray = new String[integerList.size()];
//        for (int i = 0; i < strArray.length; i++){
//            strArray[i] =String.valueOf(integerList.get(i));
//        }
////        for (String k : strArray){
////            System.out.print(k + " ");
////        }
//        System.out.println(Arrays.toString(strArray));
//        int h = integerList.size()-1;
//        int l = integerList.size()-3;
//        List<Integer> newArrayList = integerList.subList(l,h);
//        System.out.println(newArrayList);

    }
}
