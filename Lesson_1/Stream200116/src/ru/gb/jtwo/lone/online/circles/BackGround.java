package ru.gb.jtwo.lone.online.circles;

import java.awt.*;
import java.util.SplittableRandom;

public class BackGround extends Sprite{
    private Color color = new Color (
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );

    private float counterTime = 0f; // счетчик времени обновления цвета фона

    @Override
    void update(GameCanvas canvas, float deltaTime) {
        float backGroundFrequency = 3f; // частота обновления цвета фона

        if (this.counterTime >= backGroundFrequency) {
            this.color = new Color(
                    (int)(Math.random() * 255),
                    (int)(Math.random() * 255),
                    (int)(Math.random() * 255));
            this.counterTime = 0f;
        } else {
            this.counterTime += deltaTime;
        }
    }

    @Override
    void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillRect(canvas.getLeft(),canvas.getTop(),
                canvas.getWidth(), canvas.getHeight());
    }
}
