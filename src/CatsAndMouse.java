public class CatsAndMouse {

    static String catAndMouse(int x, int y, int z) {

        if(Math.abs(z-y)<Math.abs(z-x)){
            return "Cat B";
        }
        else if(Math.abs(z-x)<Math.abs(z-y)){
            return "Cat A";
        }
        else{
            return "Mouse C";
        }
    }

}
