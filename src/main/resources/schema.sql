
--
-- Database: dbphone
--

-- --------------------------------------------------------

--
-- Struttura della tabella comment_tbl
--

CREATE TABLE COMMENT_TBL (
  IMEI varchar NOT NULL PRIMARY KEY,
  DATE date NOT NULL,
  PROBLEM enum('WIFI','BLUETOOTH','GPS','BATTERY','PROXIMITY_SENSOR','VIBRATIONS','BUTTONS','MICROPHONES','SPEAKERS','CAMERAS','FLASH','DISPLAY','FACE_ID') NOT NULL,
  COMMENT varchar
) ;

-- --------------------------------------------------------

--
-- Struttura della tabella phone_tbl
--

CREATE TABLE PHONE_TBL (
  IMEI varchar NOT NULL PRIMARY KEY,
  MODEL varchar NOT NULL,
  GB varchar NOT NULL,
  COLOR varchar NOT NULL
) ;

-- --------------------------------------------------------

--
-- Struttura della tabella test_tbl
--

CREATE TABLE TEST_TBL (
  IMEI varchar NOT NULL PRIMARY KEY,
  WIFI tinyint NOT NULL,
  BLUETOOTH tinyint NOT NULL,
  GPS tinyint NOT NULL,
  BATTERY tinyint NOT NULL,
  PROXIMITY_SENSOR tinyint NOT NULL,
  VIBRATIONS tinyint NOT NULL,
  BUTTONS tinyint NOT NULL,
  MICROPHONES tinyint NOT NULL,
  SPEAKERS tinyint NOT NULL,
  CAMERAS tinyint NOT NULL,
  FLASH tinyint NOT NULL,
  DISPLAY tinyint NOT NULL,
  FACE_ID tinyint NOT NULL,
  DATE tinyint NOT NULL
) ;



