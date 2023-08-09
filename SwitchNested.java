package com.Apnikaksha;

public class SwitchNested {
    public static void main(String[] args) {

        int collegeYear = 4;
        char branch = 'C';

        switch (collegeYear) {
            case 1:
                System.out.println("Physics,Maths,English");
                break;

            case 2:

                switch (branch) {
                    case 'C':
                        System.out.println("Operating System, Data Structure");
                        break;

                    case 'E':
                        System.out.println("Microprocessor,Logical Switching");
                        break;
                }
                break;

            case 3:

                switch (branch) {

                    case 'C':
                        System.out.println("DBMS,WebTech");
                        break;

                    case 'E':
                        System.out.println("Microelectronics,xyz");
                }
                break;

            case 4:
                switch (branch) {

                    case 'C':
                        System.out.println("MultiMedia");
                        break;

                    case 'E':
                        System.out.println("Thermal Engg");
                        break;
                }
                break;
        }
    }

}
