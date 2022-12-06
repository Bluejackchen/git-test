package com.java;

import sun.reflect.generics.tree.VoidDescriptor;

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.transferData(new Flash());
        //USB usb = new Flash();
        //com.transferData(usb);




    }



        public static class Computer{

                public void transferData(USB usb){
                    usb.start();

                    System.out.println("---------------");
                    System.out.println("gitee-push");
                    System.out.println("gitee-push");


                    usb.stop();
                }
            }



    }


    interface USB{
        void start();
        void stop();
    }

    class Flash implements USB{
        @Override
        public void start() {
            System.out.println("U盘开始工作");
        }
        @Override
        public void stop() {
            System.out.println("U盘停止工作");
        }
    }

    class printer implements USB{

        @Override
        public void start() {
            System.out.println("打印机开始工作");

        }

        @Override
        public void stop() {
            System.out.println("打印机停止工作");
        }
    }



