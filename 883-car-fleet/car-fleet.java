class Pair {
    int a;
    int b;
    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Pair[] arr = new Pair[position.length];
        for(int i=0;i<position.length;i++) {
            arr[i] = new Pair(position[i], speed[i]);
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a.a, b.a));
        Stack<Double> stack = new Stack<Double>();
        for(int i=arr.length-1;i>=0;i--) {
            double ele = calculate(target, arr[i].a, arr[i].b);
            if(stack.isEmpty() || ele > stack.peek()) {
                stack.push(ele);
            }
        }
        return stack.size();

    }
    public double calculate(int target, int position, int speed) {
        double ans = (double)(target - position)/speed;
        return ans;
    }
}