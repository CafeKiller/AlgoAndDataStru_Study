

/* 使用递归 处理迷宫 (回溯算法) */
public class MiGong {

    public void start(){
        // 设置一个二维迷宫
        int[][] map = new int[8][7];

        // 渲染墙 （1表示墙，无法移动，无法覆盖）
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
            if (i>0 && i<8){
                map[i][0] = 1;
                map[i][6] = 1;
            }
        }

        // 单独设置两堵墙
        map[3][1] = 1;
        map[3][2] = 1;


        System.out.println("输出原始地图: ");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("输出当前地图");
        if (setWay(map,1,1)){
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }
        }

    }

    /**
     * 让小球进行移动。
     * 当小球移动到 map[6][5]的时候表示小球到达了终点
     * 1表示为墙, 2表示行走路径, 3表示已走路径(无法走通)
     * 在移动小球时需要制定移动策略, 当前策略是: 下 > 右 > 上 > 左
     *
     * @param map 表示地图
     * @param ballX 表示小球的起始x轴
     * @param ballY 表示小球的起始y轴
     * @return 是否成功找到通行路径
     * */
    private boolean setWay(int[][] map, int ballX, int ballY){

        // 到达终点 回溯通行路径
        if(map[6][5] == 2){
            return true;
        }else{
            // 判断该路径是否走过
            if(map[ballX][ballY] == 0){
                // 先赋值为2, 暂定为可通行的路径
                map[ballX][ballY] = 2;
                // 按照策略 进行 下 > 右 > 上 > 左 移动
                if (setWay(map,ballX+1,ballY)){
                    return true;
                } else if (setWay(map,ballX,ballY+1)) {
                    return true;
                } else if (setWay(map,ballX-1,ballY)) {
                    return true;
                } else if (setWay(map,ballX,ballY-1)) {
                    return true;
                } else {
                    // 说明该路径无法到达终点 设置为3 并回溯
                    map[ballX][ballY] = 3;
                    return false;
                }
            }else{
                // 表示当前分支可能为 0/2/3
                return false;
            }
        }

    }



}
