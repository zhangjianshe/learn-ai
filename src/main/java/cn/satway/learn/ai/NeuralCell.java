package cn.satway.learn.ai;

public class NeuralCell {
    public float weight;
    public float bias;

    public NeuralCell() {
        weight = Util.rand(0.0f, 10f);
        bias = Util.rand(0.0f, 5f);
    }

    public String toString() {
        return String.format("%f %s ", weight,bias);
    }

    public float apply(float v) {
        return weight * v;
    }
}
