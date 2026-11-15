// LeetCode 65 - Valid Number
class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        return s.matches("[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?");
    }
}
