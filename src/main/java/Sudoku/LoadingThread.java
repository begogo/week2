package Sudoku;

public class LoadingThread extends Thread {
    String str;
    boolean hasDone = false;

    public LoadingThread(String str){
        this.str = str;
    }

    public void setLoadingThread(boolean hasDone){
        this.hasDone = hasDone;
    }

    @Override
    public void run(){
        while (!hasDone){
            System.out.print(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
