DROP TABLE IF EXISTS TBL_SORT;
  
CREATE TABLE TBL_SORT (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  ini_data VARCHAR(250) NOT NULL,
  sort_data VARCHAR(250) NOT NULL,
  swap VARCHAR(250) DEFAULT NULL
);