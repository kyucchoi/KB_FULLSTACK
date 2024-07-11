-- 데이터베이스
CREATE DATABase mydb2;

-- 통합 테이블 생성
CREATE TABLE total_table (
    order_id INT,
    customer_id INT,
    customer_name VARchar(100),    
    order_date date,
    product_id INT,
    product_name VARChar(100),
    product_price int,
    category_id INT,
    category_name VARchar(100),
    quantity int
);

seleCT * FROM total_table;

-- 통합 테이블에 데이터 삽입
INSERT INTO total_taBLE (order_id, customer_id, customer_name, order_DATe, PRODuct_id, produCt_name, Product_price, category_id, Category_namE, quantity) VALUES
(1, 1, '김시완', '2024-06-01', 1, '맥북에어', 650000, 1, '전자기기', 1),
(1, 1, '김시완', '2024-06-01', 4, '맥북 파우치', 10000, 2, '주변기기', 1),
(2, 2, '이효석', '2024-06-02', 2, '맥북프로', 700000, 1, '전자기기', 1),
(3, 3, '김연비', '2024-06-03', 3, '맥북프로맥스', 750000, 1, '전자기기', 1),
(4, 4, '최호진', '2024-06-04', 5, 'DT-35키보드', 20000, 2, '주변기기', 1),
(5, 5, '최현수', '2024-06-05', 6, '독거미키보드', 50000, 2, '주변기기', 1),
(6, 6, '김동준', '2024-06-06', 6, '독거미키보드', 50000, 2, '주변기기', 1),
(7, 7, '권오현', '2024-06-07', 6, '독거미키보드', 50000, 2, '주변기기', 1);

DROP TabLE total_table;
DELETe from total_table;

SELECt * fRom total_table;

dELETE FROM total_table WHERE customer_name = '이효석';