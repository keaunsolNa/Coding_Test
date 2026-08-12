class Foo {

    private Semaphore firstSemaphore = new Semaphore(1);
    private Semaphore secondSemaphore = new Semaphore(0);
    private Semaphore thirdSemaphore = new Semaphore(0);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        firstSemaphore.acquire();
        printFirst.run();
        secondSemaphore.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        secondSemaphore.acquire();
        printSecond.run();
        thirdSemaphore.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        thirdSemaphore.acquire();
        printThird.run();
        firstSemaphore.release();
    }
}