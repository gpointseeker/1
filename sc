##########
adicionar discos
sudo parted /dev/sdY mklabel gpt
sudo parted -a optimal /dev/sdY mkpart primary ext4 0% 20%
sudo parted -a optimal /dev/sdY mkpart primary ext4 20% 100%

lsblk   -lista partições

formata partições
sudo mkfs.ext4 /dev/sdX1

definir mout auto no fyle system
sudo nano /etc/fstab
adcionar linhas
/dev/sdX1 /mnt/disk1_part1 ext4 defaults 0 2

clonar particao
sudo dd if=/dev/sdX1 of=/dev/sdY1 bs=4M status=progress

#bin/bash
sudo parted /dev/sdZ mkpart primary ext4 0% 100%
sudo mkfs.ext4 /dev/sdZ1
sudo mkdir -p /mnt/diskZ_part1
echo "/dev/sdZ1 /mnt/diskZ_part1 ext4 defaults 0 2" | sudo tee -a /etc/fstab
sudo mount -a
====

abrir crontag
crontab -e

======
rsyslog -- 

sudo apt-get install rsyslog

sudo nano /etc/rsyslog.conf

sudo nano /etc/logrotate.d/auth

tar -czvf logrotate_config.tar.gz -C ~/ logrotate_config

find / -name "myfile.txt" 2> /dev/null
find /var/log -size +5k 2>/dev/null
