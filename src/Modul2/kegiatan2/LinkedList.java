package Modul2.kegiatan2;

public class LinkedList {
        class Node {
            int data;
            Node next;

            public Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        public Node head = null;
        public Node tail = null;

        // method add berfungsi menambahkan node baru
        public void add(int data)
        {
            // tambah node baru
            Node newNode = new Node(data);

            // cek list apakah kosong
            if (head == null) {

                // kalo kosong , head dan tail akan menuju ke node baru
                head = newNode;
                tail = newNode;
            }
            else {

                //menambahkan node baru pada tail
                tail.next = newNode;

                //node yang baru akan ditambahkan didalam tail terakhir
                tail = newNode;
            }
        }

        public void sortList()
        {
            // Node current will point to head
            Node current = head, index = null;
            int temp;

            if (head == null) {
                return;
            }
            else {
                while (current != null) {
                    index = current.next;

                    while (index != null) {
                        if (current.data > index.data) {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
        }
        public void Output()
        {
            Node current = head;

            while (current != null) {
                // Print each node by incrementing pointer
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        public static void main(String[] args)
        {
            LinkedList list = new LinkedList();
            list.add(8);
            list.add(7);
            list.add(1);
            list.add(4);
            list.add(6);
            list.add(2);
            list.add(3);

            System.out.println("Original list: ");
            list.Output();

            list.sortList();
            System.out.println("Sorted list: ");
            list.Output();
            //
        }
    }
