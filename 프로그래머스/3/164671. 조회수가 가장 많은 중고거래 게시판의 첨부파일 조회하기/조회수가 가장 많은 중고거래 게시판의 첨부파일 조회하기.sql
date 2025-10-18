
SELECT '/home/grep/src/'||f.board_id||'/'||file_id||file_name||file_ext"FILE_PATH"
FROM USED_GOODS_FILE f
RIGHT JOIN USED_GOODS_BOARD b
ON b.BOARD_ID=f.BOARD_ID
WHERE views=(SELECT MAX(views) FROM USED_GOODS_BOARD)
ORDER BY file_id DESC;