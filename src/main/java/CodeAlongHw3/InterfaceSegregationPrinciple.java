package CodeAlongHw3;

public class InterfaceSegregationPrinciple {
/*
This principle states that a client shouldn't be forced to implement an
interface that it doesn't use.
 */

        public static void main(String[] args) {

        }
    }

    interface Worker {
        void work();
    }

    interface Sleeping {
        void sleep();
    }

    class Human implements Worker, Sleeping {

        @Override
        public void work() {}

        @Override
        public void sleep() {}
    }

    class Robot implements Worker {

        @Override
        public void work() {}
    }

