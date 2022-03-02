package com.gaurasis.facade;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
abstract public class Worker {

    public void goToSleep(){
        LOGGER.info("{} go to sleep.",name());

    }
    public void wakeUp(){
        LOGGER.info("{} wakes up",name());
    }
    public void goToMine() {
        LOGGER.info("{} goes to the mine.", name());
    }

    abstract public void work();
    abstract public String name();
    public void goHome(){
        LOGGER.info("{} goes home after work",name());
    }

    public void action(Action action){
        switch(action){
            case GO_HOME:
                goHome();
                break;
            case WORK:
                work();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_TO_SLEEP:
                goToSleep();
                break;
            default:
                LOGGER.info("Undefined action");
                break;
        }
    }

    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }

    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}
