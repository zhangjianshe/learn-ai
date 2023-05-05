package cn.satway.learn.ai;

/**
 * learn ai
 * ----------------------------------
 * 模拟一个神经元的操作
 */
public class AiLearn1 {

    float[][] data = {
            {0, 0},
            {1, 2},
            {2, 4},
            {3, 6},
            {4, 8}
    };

    public static void main(String[] args) {
        AiLearn1 app = new AiLearn1();
        app.run();
    }

    // y=w*x+b
    NeuralCell cell = new NeuralCell();
    public void run() {
        System.out.println(cell.toString());

        float epsilon =1e-3f;
        float rate =1e-3f;
        System.out.println(String.format("cost %.6f",cost(cell.weight,cell.bias)));

        for(int i=0; i<1000;i++) {
            float c=cost(cell.weight,cell.bias);
            float dw = (cost(cell.weight + epsilon,cell.bias) - c) / epsilon;
            float db = (cost(cell.weight ,cell.bias+epsilon) - c) / epsilon;
            cell.weight -= dw * rate;
            cell.bias -= db * rate;

            System.out.println(String.format("weight %.6f cost %.6f", cell.weight, cost(cell.weight,cell.bias)));
        }

        System.out.println(cell);

        float x0=10;
        System.out.print("prodict x("+x0+"->"+(cell.weight*x0+cell.bias));

    }

    float cost(float weight,float bias)
    {
        float result=0f;
        for (int i = 0; i < data.length; i++) {
            float[] row = data[i];
            float y =weight*row[0]+bias;
            float diff=y-row[1];
            result+=diff*diff;
        }
        result /=data.length;
        return result;
    }

}
