package com.springmvc.commons.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * @program: decision_analysis
 * @description: excel 工具类
 * @author: lou wei
 * @create: 2019-03-07 16:36
 **/
public class ExcelUtils {

    /**
     *
     * @param title 标题
     * @param column 列名
     * @param data 数据
     * @param request
     * @param response
     * @return
     */
    public static String export(List title, List column, List<Map<String, Object>> data,
                                HttpServletRequest request, HttpServletResponse response) {

        OutputStream os = null;
        try {

            // 创建新的Excel 工作簿
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();

            //第二行添加类型名称
            HSSFRow secondRow = sheet.createRow(1);
            //第二行添加头部
            for (int i = 0; i < title.size(); i++) {
                HSSFCell cell = secondRow.createCell(i);
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                if (title.get(i) != null) {
                    cell.setCellValue((String) title.get(i));
                }

            }


            //循环添加数据
            for (int x = 0; x < data.size(); x++) {

                Map<String, Object> map = data.get(x);

                HSSFRow row = sheet.createRow(x + 2);

                if (column != null && column.size() > 0) {

                    for (int i = 0; i < column.size(); i++) {

                        HSSFCell cell = row.createCell(i);
                        cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                        System.out.println(column.get(i));
                        cell.setCellValue(String.valueOf(map.get(column.get(i))));

                    }

                }

            }


            //以下载的形式
            response.setContentType("application/octet-stream");

            // 根据不同浏览器 设置response的Header
            String userAgent = request.getHeader("User-Agent").toLowerCase();

            if (userAgent.indexOf("msie") != -1) {
                //ie浏览器
                response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("机具.xls", "UTF8"));

            } else {
                response.addHeader("Content-Disposition", "attachment;filename=" + new String("机具.xls".getBytes("UTF-8"), "ISO-8859-1"));
            }

            os = response.getOutputStream();
            workbook.write(os);
            os.flush();
            return null;


        } catch (Exception e) {
            e.printStackTrace();
            response.reset();
            //返回异常页面
            return "exception";
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}
