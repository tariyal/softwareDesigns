package com.gaurasis.singleton;

public class ThreadSafeLazyTower {

    private ThreadSafeLazyTower(){
        if(Instance!=null){
            throw new IllegalStateException("Instance could n't have been initialized");
        }
    };
    private static volatile  ThreadSafeLazyTower Instance;
    public static ThreadSafeLazyTower getInstance(){
            if(Instance==null){
                synchronized (ThreadSafeLazyTower.class){
                    if(Instance==null){
                        Instance = new ThreadSafeLazyTower();
                    }
                }
            }
            return Instance;
    }
    public void description(){
        System.out.println("This is a lazy thread safe tower");
    }


}

