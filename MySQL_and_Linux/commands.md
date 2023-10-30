# Выполнение заданий в Linux и MySQL

### 1. Использование команды `cat` в Linux.

Для создания файлов с помощью команды `cat` в терминале операционной системы Linux необходимо выполнить следующие команды:

- Создание файла "Pets" и заполнение его содержимым:

    ```
    cat > "Pets"
    собаки
    кошки
    хомяки
    Ctrl + D
    ```

- Создание файла "Pack animals" и заполнение его содержимым:

    ```
    cat > "Pack animals"
    лошади
    верблюды
    ослы
    Ctrl + D
    ```

- Объединение файлов с помощью команды `cat`:

    ```
    cat "Pets" "Pack animals" > "Animals"
    ```

- Просмотр содержимого созданного файла:

    ```
    cat "Animals"
    ```

- Переименование файла "Animals" на "Human Friends":

    ```
    mv "Animals" "Human Friends"
    ```

### 2. Работа с директориями в Linux.

Для создания директории и перемещения файла в нее в терминале операционной системы Linux необходимо выполнить следующие команды:

- Создание директории "animals_directory":

    ```
    mkdir animals_directory
    ```

- Перемещение файла "Друзья животных" в созданную директорию:

    ```
    mv "Human Friends" animals_directory/
    ```

### 3. Работа с MySQL в Linux.

- Подключить дополнительный репозиторий MySQL:

    ```
    sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.17-1_all.deb
    sudo dpkg -i mysql-apt-config_0.8.17-1_all.deb
    ```

- Установить и обновить пакет mysql-server:

    ```
    sudo apt-get update
    sudo apt-get install mysql-server
    ```

### 4. Управление deb-пакетами.

- Установить и затем удалить deb-пакет, используя команду `dpkg`.

    ```
    wget http://ftp.us.debian.org/debian/pool/main/s/sl/sl_5.02-1_amd64.deb
    sudo dpkg -i sl_5.02-1_amd64.deb
    sl


    sudo dpkg -r sl
    ```

### 5. История команд в терминале Ubuntu.

    ```
    cat > "Pets" << Ctrl + D
    cat > "Pack animals" << Ctrl + D
    cat "Pets" "Pack animals" > "Animals"
    cat "Animals"
    mv "Animals" "Human Friends"
    mkdir animals_directory
    mv "Human Friends" animals_directory/
    sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.17-1_all.deb
    sudo dpkg -i mysql-apt-config_0.8.17-1_all.deb
    sudo apt-get update
    sudo apt-get install mysql-server
    wget http://ftp.us.debian.org/debian/pool/main/s/sl/sl_5.02-1_amd64.deb
    sudo dpkg -i sl_5.02-1_amd64.deb
    sl
    sudo dpkg -r sl
    ```