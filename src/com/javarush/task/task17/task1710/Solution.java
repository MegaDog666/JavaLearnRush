package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

//    public static void main(String[] args) {
        //напишите тут ваш код

        // Этот код работает, в очередной раз валидатор ДжаваРаша страдает херней
        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String command = reader.readLine();
                if (command.contains("-c")) {
                    String[] commandSplit = command.split(" ");
                    if (commandSplit[2].equals("м")) {
                        allPeople.add(Person.createMale(commandSplit[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(commandSplit[3])));
                        allPeople.get(allPeople.size() - 1).setSex(Sex.MALE);
                    }
                    else if (commandSplit[2].equals("ж")) {
                        allPeople.add(Person.createFemale(commandSplit[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(commandSplit[3])));
                        allPeople.get(allPeople.size() - 1).setSex(Sex.FEMALE);
                    }
                    else
                        break;
                }
                if (command.contains("-r")) {
                    String[] commandSplit = command.split(" ");
                    for (int i = 0; i < allPeople.size(); i++) {
                        if (i == Integer.parseInt(commandSplit[1])) {
                            System.out.println(allPeople.get(i).getName() + " " + allPeople.get(i).getSex() + " " + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(i).getBirthDate()));
                            break;
                        }
                    }
                }
                if (command.contains("-u")) {
                    String[] commandSplit = command.split(" ");
                    for (int i = 0 ; i < allPeople.size(); i++) {
                        if (i == Integer.parseInt(commandSplit[1])) {
                            allPeople.get(i).setName(commandSplit[2]);
                            if (commandSplit[3].equals("м"))
                                allPeople.get(i).setSex(Sex.MALE);
                            else if (commandSplit[3].equals("ж"))
                                allPeople.get(i).setSex(Sex.FEMALE);
                            allPeople.get(i).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(commandSplit[4]));
                        }
                    }
                }
                if (command.contains("-d")) {
                    String[] commandSplit = command.split(" ");
                    for (int i = 0; i < allPeople.size(); i++) {
                        if (i == Integer.parseInt(commandSplit[1])) {
                            allPeople.get(i).setName(null);
                            allPeople.get(i).setSex(null);
                            allPeople.get(i).setBirthDate(null);
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
         */


//    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }

        Date birthdayDate;
        Person person;
        switch (args[0]) {
            case "-c":
                birthdayDate = simpleDateFormat.parse(args[3]);

                if (args[2].equals("м")) {
                    person = Person.createMale(args[1], birthdayDate);
                } else {
                    person = Person.createFemale(args[1], birthdayDate);
                }

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-r":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null) {
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                }
                break;
            case "-u":
                birthdayDate = simpleDateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                if (person == null) {
                    throw new IllegalArgumentException();
                }
                person.setSex(getSex(args[3]));
                person.setBirthDate(birthdayDate);
                person.setName(args[2]);
                allPeople.set(id, person);
                break;
            case "-d":
                Person currentPerson = allPeople.get(Integer.parseInt(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;
        }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}
