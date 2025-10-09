SELECT p.product_code,SUM(p.price*o.sales_amount)SALES
FROM PRODUCT p
JOIN OFFLINE_SALE o
ON p.PRODUCT_ID=o.PRODUCT_ID
GROUP BY p.product_code
ORDER BY SALES DESC,p.product_code;