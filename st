<VirtualHost *:443>
        ServerName www.site.xyz
        ServerAdmin webmaster@localhost
        DocumentRoot /var/www/html/site
        DirectoryIndex index.html
        ErrorLog ${APACHE_LOG_DIR}/spain_portugal/error.log
        <Directory  /var/www/html/site
              Options -Indexes +FollowSymLinks
              Order allow,deny
              Allow from all
        </Directory>
        <Directory  /var/www/html/site/private>
                AuthUserFile /etc/apache2/.htpasswd
                AuthName "Restricted Area"
                AuthType Basic
                Require valid-user
        </Directory>
        SSLEngine On
        SSLCertificateFile      /etc/ssl/certs/ssl-cert-snakeoil.pem
        SSLCertificateKeyFile /etc/ssl/private/ssl-cert-snakeoil.key
</VirtualHost>

<VirtualHost *:80>
     ServerName www.portugalspain.local
     Redirect permanent / https://www.portugalspain.local/
</VirtualHost>
