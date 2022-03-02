package com.gaurasis.facade;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MineWorkerFacade {
    private final List<Worker> workers;
    public void startNewDay(){
        makeAction(workers,Worker.Action.WAKE_UP,Worker.Action.GO_TO_MINE);
    }
    public void doWork(){
        makeAction(workers,Worker.Action.WORK);
    }
    public void endDay(){
        makeAction(workers,Worker.Action.GO_HOME,Worker.Action.GO_TO_SLEEP);
    }
    public MineWorkerFacade() {
        workers = Arrays.asList(
                new CartWorker(),
                new GoldMiner(),
                new TunnelDigger());
    }

    private void makeAction(Collection<Worker> workers,
                            Worker.Action... actions){
        workers.forEach(worker -> worker.action(actions));
    }
}
