package Tugas_LAB_PBO.TP_8.Task_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static int jumlahData = 4;
    static UiThread uiThread = new UiThread();
    static BackgroundThread backgroundThread = new BackgroundThread();
    
    public static void main(String[] args) {
        uiThread.mulai(jumlahData);
        ExecutorService excutor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < jumlahData; i++) {
            excutor.submit(new BackgroundThread());
        }
        excutor.shutdown();
        
        try {
            int totalTime = 0;
            while (!excutor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uiThread.checkData(totalTime);
            }
            uiThread.taskFinish(totalTime, jumlahData - backgroundThread.getFailedLoaded(), backgroundThread.getFailedLoaded());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
