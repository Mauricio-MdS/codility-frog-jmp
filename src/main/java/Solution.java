class Solution {
    public int solution(int initialPosition, int destination, int jump) {
        double distanceToJump = Math.max((double)destination-initialPosition, 0);
        return (int) Math.ceil(distanceToJump/jump);
    }
}
