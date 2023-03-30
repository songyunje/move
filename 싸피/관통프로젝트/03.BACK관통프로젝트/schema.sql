CREATE SCHEMA health;

Use health; 

CREATE TABLE `video` (
	`id` varchar(45) NOT NULL PRIMARY KEY,
    `title` varchar(45) NOT NULL,
    `part` varchar(45) NOT NULL,
    `channelName` varchar(45) NOT NULL,
    `url` varchar(45) NOT NULL,
    `img` varchar(45) NOT NULL
)ENGINE=InnoDB;

insert into video
values
	("gMaB-fG4u4g",
    "전신 다이어트 최고의 운동",
    "전신",
    "ThankyouBUBU",
     "https://www.youtube.com/embed/gMaB-fG4u4g" ,
     "추천1.PNG"),
     ("swRNeYw1JkY",
     "하루 15분! 전신 칼로리 불태우는 다이어트 운동",
     "전신",
    "ThankyouBUBU",
    "https://www.youtube.com/embed/swRNeYw1JkY",
    "추천2.PNG"),
    ("54tTYO-vU2E",
     "상체 다이어트 최고의 운동 BEST",
    "상체",
     "ThankyouBUBU",
    "https://www.youtube.com/embed/54tTYO-vU2E",
    "추천3.PNG"),
    ("QqqZH3j_vH0",
    "상체비만 다이어트 최고의 운동 [상체 핵매운맛]",
    "상체",
    "ThankyouBUBU",
    "https://www.youtube.com/embed/QqqZH3j_vH0",
    "추천4.PNG"),
    ("tzN6ypk6Sps",
     "하체운동이 중요한 이유?",
    "하체",
	"김강민",
    "https://www.youtube.com/embed/tzN6ypk6Sps",
    "추천5.PNG"),
    ( "u5OgcZdNbMo",
    "저는 하체 식주의자 입니다",
    "하체",
    "GYM종국",
    "https://www.youtube.com/embed/u5OgcZdNbMo",
    "추천6.PNG"),
    ("PjGcOP-TQPE",
    "11자복근 복부 최고의 운동 [복근 핵매운맛]",
    "복부",
    "ThankyouBUBU",
    "https://www.youtube.com/embed/PjGcOP-TQPE",
    "추천7.PNG"),
    ("7TLk7pscICk",
    "(Sub)누워서하는 5분 복부운동!!",
    "복부",
    "SomiFit",
    "https://www.youtube.com/embed/7TLk7pscICk",
    "추천8.PNG");
    
    select*from video;

CREATE TABLE healthboard (
	id INT AUTO_INCREMENT,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    writer VARCHAR(20) NOT NULL,
    title VARCHAR(50) NOT NULL,
    content TEXT,
    view_cnt INT DEFAULT 0,
    reg_date TIMESTAMP DEFAULT now(),
    videoid VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

