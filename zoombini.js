var _= require("lodash");

var hair = {
    tuft : 0,
    ponytail : 1,
    girlCap : 2,
    messy : 3,
    cool : 4,
    boyCap : 5,
    spiky : 6,
    curly : 7
};

var eye = {
    oneEye : 0,
    twoEyes : 1,
    droopyEyes : 2,
    glasses : 3,
    sunglasses : 4,
    glasses2 : 5,
    sunglasses2 : 6
};

var nose = {
    white : 0,
    red : 1,
    pink : 2,
    orange : 3,
    green : 4,
    lightgreen : 5,
    blue : 6,
    purple : 7
};

var feet = {
    pinkShoes : 0,
    spring : 1,
    flier : 2,
    skates : 3,
    wheels : 4,
    skates2 : 5,
    wheels2 : 6
};

var Zoombini = function (hair, eyes, nose, feet) {

    this.hair=hair;
    this.eyes=eyes;
    this.nose=nose;
    this.feet=feet;
};

var zoom1 = new Zoombini(0, 0, 0, 0);
var zoom2 = new Zoombini(1, 1, 1, 1);
var zoom3 = new Zoombini(2, 2, 2, 2);

var zoombinis = [zoom1, zoom2, zoom3];

var attributes = [hair, eye, nose, feet];

_.map(_.sortByOrder(zoombinis, attributes, [true, false]), _.values);
