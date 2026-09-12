class Solution {
    public boolean isRobotBounded(String s) {
        int x = 0;
        int y = 0;
        int n = s.length();
        String dir = "north";

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == 'G' && dir == "north") {
                y++;
            } else if (c == 'G' && dir == "left") {
                x--;
            } else if (c == 'G' && dir == "right") {
                x++;
            } else if (c == 'G' && dir == "south") {
                y--;
            }

            if (dir == "north") {
                if (c == 'L') {
                    dir = "left";
                } else if (c == 'R') {
                    dir = "right";
                }
            } else if (dir == "left") {
                if (c == 'L') {
                    dir = "south";
                } else if (c == 'R') {
                    dir = "north";
                }
            } else if (dir == "right") {
                if (c == 'L') {
                    dir = "north";
                } else if (c == 'R') {
                    dir = "south";
                }
            } else {
                if (c == 'L') {
                    dir = "right";
                } else if (c == 'R') {
                    dir = "left";
                }
            }
        }

        if (x == 0 && y == 0) {
            return true;
        }

        return !dir.equals("north");
    }
}