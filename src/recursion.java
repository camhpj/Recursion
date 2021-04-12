public class recursion {

    public static void main(String[] args){

        System.out.println(pairStar("xxyy"));
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static int bunnyEars(int bunnies){
        if(bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int bunnyEars2(int bunnies){
        if(bunnies == 0) return 0;
        if(bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);
        if(bunnies % 2 == 1) return 2 + bunnyEars2(bunnies-1);
        return 0;
    }

    public static int triangle(int rows){
        if(rows == 0) return 0;
        return rows + triangle(rows-1);
    }

    public static int sumDigits(int n){
        int rightMost = n % 10;
        if(n / 10 == 0) return rightMost;
        return rightMost + sumDigits(n/10);
    }

    public static int count7(int n){
        if(n % 10 == 7) return 1 + count7(n/10);
        if(n / 10 == 0) return 0;
        return count7(n/10);
    }

    public static int count8(int n){
        if((n % 10 == 8) && ((n / 10) % 10 == 8)) return 2 + count8(n/10);
        else if(n % 10 == 8) return 1 + count8(n/10);
        if(n / 10 == 0) return 0;
        return count8(n/10);
    }

    public static int powerN(int base, int n){
        if(base < 0 || n == 0) return 1;
        return base * powerN(base, n-1);
    }
    public static int countX(String str){
        if(str.length() == 0) return 0;
        if(str.startsWith("x")) return 1 + countX(str.substring(1));
        return countX(str.substring(1));
    }

    public static int countHi(String str){
        if(str.length() == 0) return 0;
        if(str.startsWith("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }

    public static String changeXY(String str){
        if(str.indexOf('x') == -1) return str;
        return changeXY(str.replaceFirst("x", "y"));
    }

    public static String changePi(String str){
        if(!str.contains("pi")) return str;
        return changePi(str.replaceFirst("pi", "3.14"));
    }

    public String noX(String str){
        if(str.indexOf('x') == -1) return str;
        return noX(str.replaceFirst("x", ""));
    }

    public static boolean array6(int[] nums, int index){
        if(index < nums.length && nums[index] == 6) return true;
        if(nums.length == 0 || index == nums.length) return false;
        return array6(nums, index+1);
    }

    public static int array11(int[] nums, int index){
        if(index < nums.length && nums[index] == 11) return 1 + array11(nums, index + 1);
        if(nums.length == 0 || index == nums.length) return 0;
        return array11(nums, index+1);
    }

    public static boolean array220(int[] nums, int index){
        if(index < nums.length - 1 && nums[index + 1] == (nums[index] * 10)) return true;
        if(nums.length == 0 || index == nums.length) return false;
        return array220(nums, index + 1);
    }

    public static String allStar(String str){
        if(str.lastIndexOf('*') == str.length() - 2 || str.length() == 0) return str;
        if(str.lastIndexOf('*') == -1) return allStar(str.charAt(0) + "*" + str.substring(1));
        return allStar(str.substring(0, str.lastIndexOf('*') + 2) + "*" + str.substring(str.lastIndexOf('*') + 2));
    }

    public static String pairStar(String str){
        return "0";
    }

    public static String endX(String str){
        return "0";
    }
}