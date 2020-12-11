//package pokerdangal;
package PD;
public class PDThread implements Runnable {

    String[] userAttribute;
    long count;
    
    public PDThread(String[] userAttribute, long count) {
        this.userAttribute = userAttribute;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            PDGamePlayTest pdGamePlayTest = new PDGamePlayTest();
            pdGamePlayTest.setUserAttribute(this.userAttribute, this.count);

            pdGamePlayTest.setUp();
            pdGamePlayTest.pDGamePlay();
            pdGamePlayTest.tearDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
