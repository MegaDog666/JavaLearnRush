package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        Random random = new Random();
        int i = random.nextInt(8);
        if (i == 0) {
            return CERTAIN;
        } else if (i == 1) {
            return DEFINITELY;
        } else if (i == 2) {
            return MOST_LIKELY;
        } else if (i == 3) {
            return OUTLOOK_GOOD;
        } else if (i == 4) {
            return ASK_AGAIN_LATER;
        } else if (i == 5) {
            return TRY_AGAIN;
        } else if (i == 6) {
            return NO;
        } else if (i == 7) {
            return VERY_DOUBTFUL;
        }
        return null;
    }
}
