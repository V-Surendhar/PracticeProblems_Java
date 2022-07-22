//package Linkedlist;
//
//public class sortklist {
//
//
//    public static void main(String[] args) {
//        linkedlist list1 = new linkedlist();
//        list1.add(3);
//        list1.add(8 ) ;
//        list1.add(13);
//
//        linkedlist list2 = new linkedlist();
//
//        list2.add(4);
//        list2.add( 9 );
//        list2.add(14);
//
//        linkedlist list3 = new linkedlist();
//
//        list2.add(5);
//        list2.add( 10 );
//        list2.add(15);
//
//
//        linkedlist list4 = new linkedlist();
//
//        list2.add(6);
//        list2.add( 11 );
//        list2.add(16);
//
//        linkedlist list5 = new linkedlist();
//
//        list2.add(7);
//        list2.add( 12 );
//        list2.add(17);
//
//        linkedlist[] lists = { list1,list2,list3,list4,list5};
//
//        for(linkedlist a : lists){
//
//             a.printvalues() ;
//
//
//        }
//
//        mergeklist(lists,0,lists.length-1);
//
//
//
//
//    }
//
//    private static linkedlist mergeklist(linkedlist[] lists,int start , int end) {
//
//        int mid = (start + end )/2 ;
//
//        if( start == end){
//            return lists[start];
//        }
//
//        linkedlist first = mergeklist( lists , start , mid );
//        linkedlist second = mergeklist(lists , mid+1 , end);
//
//        return  mergetwolist(first , second);
//
//
//    }
//
//    private static linkedlist mergetwolist(linkedlist first, linkedlist second) {
//
//        linkedlist.Node dummy = new linkedlist.Node();
//
//        linkedlist.Node tail = dummy ;
//
//
//
//
//
//
//    }
//
//
//}
