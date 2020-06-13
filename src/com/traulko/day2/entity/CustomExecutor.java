package com.traulko.day2.entity;

public class CustomExecutor {
    private String surname;
    private int countOfDaysToExecute;

    public CustomExecutor(String surname, int countOfDaysToExecute) {
        this.surname = surname;
        this.countOfDaysToExecute = countOfDaysToExecute;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCountOfDaysToExecute() {
        return countOfDaysToExecute;
    }

    public void setCountOfDaysToExecute(int countOfDaysToExecute) {
        this.countOfDaysToExecute = countOfDaysToExecute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass() || o == null) {
            return false;
        }
        CustomExecutor other = (CustomExecutor) o;
        return (this.surname.equals(other.surname) &&
                this.countOfDaysToExecute == other.countOfDaysToExecute);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + surname.hashCode();
        result = prime * result + countOfDaysToExecute;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomExecutor{");
        sb.append("surname='").append(surname).append('\'');
        sb.append(", countOfDaysToExecute=").append(countOfDaysToExecute);
        sb.append('}');
        return sb.toString();
    }
}
