package com.itacademy.javacore.homeWork.homeWork16.task3.strategy;

public class ChoiceSort implements SortStrategy {
    @Override
    public void sort(int[] ints) {
         /*�� ������� ����� ������������� ��� ������������
      ��������� ������� (0 - ���������, 1-���������,
      2-���������,...)*/
        for (int i = 0; i < ints.length; i++) {
        /*������������, ��� ������ ������� (� ������
           ������������ ���������) �������� ����������� */
            int min = ints[i];
            int min_i = i;
        /*� ���������� ����� ������������ ���� �������,
           ������� ������ ��������������� ��������*/
            for (int j = i+1; j < ints.length; j++) {
                //���� �������, ���������� ��� ������
                if (ints[j] < min) {
                    min = ints[j];
                    min_i = j;
                }
            }
        /*���� ������� �������, �������, ��� �� ������� �������,
          ������ �� �������*/
            if (i != min_i) {
                int tmp = ints[i];
                ints[i] = ints[min_i];
                ints[min_i] = tmp;
            }
        }

    }
}
