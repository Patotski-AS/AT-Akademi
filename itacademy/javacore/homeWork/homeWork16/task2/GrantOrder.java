package com.itacademy.javacore.homeWork.homeWork16.task2;


import com.itacademy.javacore.homeWork.homeWork16.task2.state.*;

/**
 * Context task
 */
public class GrantOrder {
    private String name;
    private State state;

    public GrantOrder(String name) {
        this.name = name;
    }

    public void yes() {
        if (state instanceof Established) {
            this.setState(new Considered());
            state.currentState();
        }
       else if (state instanceof Considered) {
            this.setState(new Confirmed());
            state.currentState();
        }
       else if (state instanceof Deferred) {
            this.setState(new Considered());
            state.currentState();
        }
    }

    public void no() {
        if (state instanceof Established) {
            this.setState(new Withdrawn());
            state.currentState();
        }
       else if (state instanceof Considered) {
            this.setState(new Deferred());
            state.currentState();
        }
       else if (state instanceof Deferred) {
            this.setState(new Rejected());
            state.currentState();
        }
    }

    public void currentState() {
        this.state.currentState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
