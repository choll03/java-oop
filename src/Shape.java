class Shape {

    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 1;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}