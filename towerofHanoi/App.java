//LAGUARDIA, LUIS
//COM221
//recursive func to solve tower of hanoi
class App {
    // called a static method without creating an object of the class
    static void towerOfHanoi(int n, char from_rod, // created a func towerOfHanoi, where pass the N to from_rod
            char to_rod, char aux_rod) {
        if (n == 0) { // if n is equals to 0 will return then close the block
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod); // func call for n-1
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod); // print the disk along
                                                                                              // from-to
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod); // func call for n-1
    }

    // Driver code
    public static void main(String args[]) {
        try { // to try the rods
            int N = 3;

            // a,c,b rods
            towerOfHanoi(N, 'A', 'C', 'B');
        } catch (Exception e) { // if there's an error will print sysout
            System.out.println("Something went wrong.");
        }
    }
}
