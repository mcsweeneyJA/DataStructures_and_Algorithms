package com.company;

public class MovieCollection {

    public class Node {
        //Declare properties to be used
        Movie data;
        Node left;
        Node right;

        //constructor taking the data
        public Node(Movie data){
            this.data = data;
            left = null;
            right = null;
        }
    }


    public class BST {
         Node root;


        private Node addRecursive(Node current, Movie value) {
            if (current == null) {
                return new Node(value);
            }

            if (value.title.compareToIgnoreCase(current.data.title) < 0) {
                current.left = addRecursive(current.left, value);
            } else if (value.title.compareToIgnoreCase(current.data.title) > 0) {
                current.right = addRecursive(current.right, value);
            } else {
                // value already exists
                return current;
            }

            return current;
        }
        public void add(Movie value) {
            root = addRecursive(root, value);
        }

        /*public void insert(Movie id){
            Node newNode = new Node(id);
            if(root==null){
                root = newNode;
                return;
            }
            Node current = root;
            Node parent = null;
            while(true){
                parent = current;
                if(id.title.compareToIgnoreCase(current.data.title) < 0){
                    current = current.left;
                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }*/


        public Movie find(String id){
            Node current = root;
            while(current!=null){
                if(current.data.title.equals(id)){
                    return current.data;
                }else if(id.compareTo(current.data.title) < 0){
                    current = current.left;
                }else{
                    current = current.right;
                }
            }
            return null;
        }



        //helper for deleting node
        public Movie findSmallestVal(Node root){
            return root.left == null ? root.data : findSmallestVal(root.left);
        }


        //DELETING NODE METHODS
        public Node deleteRecursive(Node current, String value){
            if (current == null){
                return null;
            }
            if (value.equalsIgnoreCase(current.data.title)) {
                // if no children (leaf node)
                if (current.left == null && current.right == null){
                    return null;
                }
                //if only one child
                if (current.right == null){
                    return current.left;
                }
                if (current.left == null){
                    return current.right;
                }

                //if both child nodes filled
                Movie smallestValue = findSmallestVal(current.right);
                current.data = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue.title);
                return current;

            }
            if (value.compareToIgnoreCase(current.data.title) < 0 ){
                current.left = deleteRecursive(current.left, value);
                return current;
            }
            current.right = deleteRecursive(current.right, value);
            return current;
        }

        public void delete(String movieName) {
            root = deleteRecursive(root, movieName);
        }



        //returns movies in DECREASING alphabetical
        public void traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                System.out.print("Movie:  " +  node.data.title + "\nStarring: "+  node.data.starring +
                        "\nDirected by: " +  node.data.director + "\nDuration" +  node.data.duration + "\nGenre: " +
                        node.data.genre + "\nClassification: " +  node.data.classification + "\nDate: " +  node.data.date + "\n\n"
                        + "Copies Available: " + node.data.copies + "\n\n" + "Times rented: " + node.data.rentalCount + "\n\n");
                traverseInOrder(node.right);
            }
        }

        public void traversePreOrder(Node node) {
            if (node != null) {
                System.out.print("Movie:  " +  node.data.title + "\nStarring: "+  node.data.starring +
                        "\nDirected by: " +  node.data.director + "\nDuration" +  node.data.duration + "\nGenre: " +
                        node.data.genre + "\nClassification: " +  node.data.classification + "\nDate: " +  node.data.date + "\n\n");
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }
        }

        public void traversePostOrder(Node node) {
            if (node != null) {
                traversePostOrder(node.left);
                traversePostOrder(node.right);
                System.out.print("Movie:  " +  node.data.title + "\nStarring: "+  node.data.starring +
                        "\nDirected by: " +  node.data.director + "\nDuration" +  node.data.duration + "\nGenre: " +
                        node.data.genre + "\nClassification: " +  node.data.classification + "\nDate: " +  node.data.date + "\n\n");
            }
        }




        public BST(){
            this.root = null;
        }



    }

    public MovieCollection(){
        BST bst = new BST();
    }



}
