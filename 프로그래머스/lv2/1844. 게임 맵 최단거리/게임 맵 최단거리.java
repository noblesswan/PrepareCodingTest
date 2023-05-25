import java.util.*;

class Solution {
    private static final int[] dx = {-1, 1, 0, 0}; // 상하좌우 방향
    private static final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length; // 행의 개수
        int m = maps[0].length; // 열의 개수

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0, 1)); // 시작 위치를 큐에 추가
        maps[0][0] = 0; // 방문한 위치는 벽으로 표시하여 다시 방문하지 않도록 함

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int x = current.x;
            int y = current.y;
            int count = current.count;

            if (x == n - 1 && y == m - 1) {
                return count; // 상대 팀 진영에 도착한 경우 최단 경로의 칸 수를 반환
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1) {
                    queue.offer(new Node(nx, ny, count + 1)); // 다음 위치를 큐에 추가
                    maps[nx][ny] = 0; // 방문한 위치는 벽으로 표시하여 다시 방문하지 않도록 함
                }
            }
        }

        return -1; // 상대 팀 진영에 도착할 수 없는 경우
    }

    class Node {
        int x;
        int y;
        int count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
