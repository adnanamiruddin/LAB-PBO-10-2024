package Tugas_LAB_PBO.TP_8.Task_1;

public class BackgroundThread implements Runnable{
    protected int failedLoaded = 0;

    @Override
    public void run() {
        int time = TaskTimeHelper.getAngkaRandom();

        try {
            Thread.sleep(time * 1000);
            if (time > 4) {
                System.out.println("Request Timeout");
                setFailedLoaded(failedLoaded++);
            } 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    public int getFailedLoaded() {
        return failedLoaded;
    }
    public void setFailedLoaded(int failedLoaded) {
        this.failedLoaded = failedLoaded;
    }
}
