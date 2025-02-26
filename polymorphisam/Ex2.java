class animal{
    void sound (){
        System.out.println("animal make sound ");
    }

}
        class dog extends animal {
            @Override
            void sound (){
                System.out.println("dog - bark ");
            }
        }
        class cat extends animal {
            @Override
            void sound (){
                System.out.println("cat - meows ");
    }
}

public class Ex2 {
    public static void main ( String [] args ){
        animal a1;
        a1 = new dog();
        a1.sound();
        a1 = new cat();
        a1.sound();
        

    }
}
