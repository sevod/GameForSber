package org.sevod;

public enum Direction {

    //TODO почистить


    //    UP,
//    DOWN,
//    WEST,
//    EAST,
//    NORTH,
//    SOUTH,
    FORWARD("вперед"),
    BACK("назад"),
    LEFT("влево"),
    RIGHT("вправо");

    private String title;

    Direction(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


//    UP ("Верх"),
//    DOWN ("Низ"),
//    WEST ("Запад"),
//    EAST ("Восток"),
//    NORTH ("Север"),
//    SOUTH ("Юг");

//    SUNDAY ("Воскресенье"),
//    MONDAY ("Понедельник"),
//    TUESDAY ("Вторник"),
//    WEDNESDAY ("Среда"),
//    THURSDAY ("Четверг"),
//    FRIDAY ("Пятница"),
//    SATURDAY ("Суббота");

//    private String title;

//    Direction(String title) {
//        this.title = title;
//    }

//    public String getTitle() {
//        return title;
//    }

//    @Override
//    public String toString() {
//        return "DayOfWeek{" +
//                "title='" + title + '\'' +
//                '}';
//    }
//    UP,
//    DOWN,
//    WEST,
//    EAST,
//    NORTH,
//    SOUTH
}
